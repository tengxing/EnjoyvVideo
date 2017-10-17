package select;

import model.queryShow;

import java.sql.*;
import java.util.List;

public class selectSql {
    private String url = "jdbc:mysql://10.0.0.56:3306/ejvideo?useUnicode=true&characterEncoding=UTF-8";
    private String user = "video";
    private String password = "video123";

    /**
     * jdbc查询的类
     *
     * @throws Exception
     */
    public queryShow select(String name) {
       queryShow queryShow = new queryShow();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select o.title,o.majorActor,u.videoUrl," +
                    "o.content from t_org o , t_url u WHERE title LIKE ?";
            System.out.println(name);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                 queryShow.setTitle( rs.getString("title")) ;
                 queryShow.setMajorActor(rs.getString("majorActor"));
                 queryShow.setVideoUrl(rs.getString("videoUrl"));
                 queryShow.setContent(rs.getString("content"));
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
          return queryShow;

    }


}
