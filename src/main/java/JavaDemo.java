public class JavaDemo {

    public static void main(String[] args) {
        KotlinBean kotlinBean = new KotlinBean();
        kotlinBean.setAge(12);
        kotlinBean.setName("小弟弟");
        kotlinBean.setPhone("我没有手机号哦");
        System.out.println(kotlinBean.toString());
    }
}