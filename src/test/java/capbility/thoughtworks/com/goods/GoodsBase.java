package capbility.thoughtworks.com.goods;

import capbility.thoughtworks.com.goods.controller.GoodsController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class GoodsBase {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new GoodsController());
    }
}
