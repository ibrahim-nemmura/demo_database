package sample;

public class ModelTable {

    String id, name, email, prog;

    public ModelTable (String id, String name, String email, String prog) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.prog = prog;
    }
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public String getprog(){
        return prog;
    }

}
