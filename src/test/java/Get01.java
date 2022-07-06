import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get01 {
/*
        1-Postman manuel api testi icin kullanilir.
        2-API otomasyon testi icin Rest-Assured Library kullaniyoruz.
        3-Otomasyon kodlarinin yazimi icin su adimlari izliyoruz:
        -Gereksinimleri anlama
        -Test Case i yazma
          *Test Case yazimi icin gherkin language kullaniyoruz
            Gherkin bazi keywordlere sahip bunlar;
            1-Given:On kosullar
            2-When:Aksiyonlar-->Get,Put
            3-Then:Donutler-Assert
            4-And:Coklu islemler icin
        - Otomasyonda test kodunun yazımı yapılacak
        1) Set the URL (URl'yi kurmak)
        2) Set the expected Data (beklenen datanın oluşturulması)   """POST, PUT PATCH"""
        3) Type code to send request (talep göndermek için kod yazma)
        4) Do Assertion (doğrulama yapma)

 */
    /*
    Given
            https://restful-booker.herokuapp.com/booking/3
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
     */
    @Test
    public  void  get01(){
     //  1) Set the URL (URl'yi kurmak)
        String url="https://restful-booker.herokuapp.com/booking/55";

     //  2) Set the expected Data (beklenen datanın oluşturulması)   """POST, PUT PATCH"""

     //  3) Type code to send request (talep göndermek için kod yazma)
        Response response=given().when().get(url);
          //  response.prettyPrint();



        //  4) Do Assertion (doğrulama yapma)
            response.then().assertThat().statusCode(200).contentType("application/json")
                        .statusLine("HTTP/1.1 200 OK");
            //status Code nasil yazdirilir
        System.out.println("Status Code : "+response.statusCode());
        // content type yazdir
        System.out.println("Content Type :  "+response.contentType());
        //status line yazdir

        System.out.println("Status Line :  "+response.statusLine());

        System.out.println("Connection :  "+response.header("Connection"));
        System.out.println("Headers :\n"+response.headers());

        //Time yazdir
        System.out.println("Time : "+response.getTime());

    }


}
