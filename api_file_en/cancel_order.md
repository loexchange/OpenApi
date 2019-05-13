# Cancel a single order
- request method: GET
- url: https://{host}/open/api/cancel_order
- input parameter 
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}&order_id={order_id}
```
- entry instructions

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | api_key | interface key | * |
  | sign | signature data | * |
  | symbol | coin pair | * |
  | time | current timestamp | * |
  | order_id | order Id | * |
command
```
curl -X POST https://{host}/open/api/cancel_order?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=d60d07da62d733023fa89887615fd181\&time=1554186248\&symbol=mkreth\&order_id=1
```

- return information

    | the field names | type of data |  instructions |
    | --- | --- | --- |
    | code | code | 0=succeed，otherwise fail |
    | msg | content | suc=succeed，otherwise return to specific information |
    
- example
```
{
	"code": "0",
	"msg": "suc",
	"data": null
}
```
