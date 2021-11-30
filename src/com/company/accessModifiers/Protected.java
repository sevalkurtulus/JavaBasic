package com.company.accessModifiers;

public class Protected {
    protected int protectedDegisken;
    protected void protectedMethod(){

    }
    protected class InnerProtectedClass{

    }
}
class G extends Protected{
    @Override
    protected void protectedMethod() {
        super.protectedMethod();
        System.out.println(protectedDegisken);
    }
}

