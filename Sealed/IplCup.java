package Sealed;

sealed class IplCup permits Csk, Mumbai, Rcb {
    
    public void win(){
        System.out.println("won Cup!");
    }
}

