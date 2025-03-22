package Sealed;

sealed class IplCup permits Csk,Mumbai {
    
    public void win(){
        System.out.println("won Cup!");
    }
}

