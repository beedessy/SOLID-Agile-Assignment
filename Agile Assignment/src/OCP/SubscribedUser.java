package OCP;

public class SubscribedUser extends User{
    private String[] wishList;
    private String couponCode;
    private boolean hasCoupon=false;
    public SubscribedUser(String name, String email, String password, String[] favorite, String[] purchase,double price, String[] wishList,String couponCode){
        super(name,email,password,favorite,purchase,price);
        this.wishList=wishList;
        this.couponCode=couponCode;
    }
    //SETTERS AND GETTERS
    public void addToWishlist(){};
    public void removeFromWishlist(){};
    public void loadWishListOpts(){
        addToWishlist();
        removeFromWishlist();
    };

    public void login(){
        loadWishListOpts();
        purchase();
        watch();
        addFavorite();
        rateMovie();
    }
    public void purchase(){
        if (hasCoupon==true){
            System.out.println("The purhase new price is calculated with the coupon discount applied and deactivate coupon");
        }
    };
}
