package goods

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/goods/1'
    }
    response {
        status 200
        body("""
{
    "id": 1,
    "name": "小米Mix3"
}
  """)
    }
}