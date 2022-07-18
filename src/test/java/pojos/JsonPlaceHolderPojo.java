package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class JsonPlaceHolderPojo {
    /*
    1-Tum keyler icin private variable'lar olusturuyoruz

    2-Tum parametrelerle ve parametresiz constructorlarimizi olusturuyoruz

    3-getters ve setters larimizi olusturuyoruz

    4-toString() methodumuzu olusturuyoruz

     */

    private Integer userId;
    private String title;
    private Boolean completed;

    public JsonPlaceHolderPojo(Integer userId, String title, Boolean completed) {
        this.userId = userId;
        this.title = title;
        this.completed = completed;
    }

    public JsonPlaceHolderPojo(){

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "JsonPlaceHolderPojo{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    // farkli key value ikililerin uyusmazligini @JsonIgnoreProperties(ignoreUnknown = true)
    // anotation ini Pjo Classimizin basina yazarak cozebiliriz


}
