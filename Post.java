package Microblog;

public class Post {


        private String UserName;
        private String post;
        private int postNumber;

        public Post(String UserName, String Post ,int postNumber) {

                this.UserName = UserName;
                this.post = Post;
                this.postNumber = postNumber;
        }



        public String getUserName() {
                return this.UserName;


        }
        public void printPost(){

                System.out.println("UserName:" + UserName+ "\n" +"Post : "+ post+ "\n" );
        }
}