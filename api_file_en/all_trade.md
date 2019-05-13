# Check the transaction record
- request method: GET
- url: https://{host}/open/api/all_trade
- input parameter 
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}&sort={sort}&pageSize={pageSize}&page={page}
```
- entry instructions

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | api_key | interface key | * |
  | sign | signature data | * |
  | symbol | coin pair | * |
  | time | current timestamp | * |
  | sort | sort | 0 positive sequence 1 inverted order not required |
  | pageSize | number of queries | not required |
  | page | page number | not required |

- return information

    | the field names | type of data | instructions |
    | --- | --- | --- |
    | code | code | 0=succeed，otherwise fail |
    | msg | content | suc=succeed，otherwise return to specific information |
    
-command
```
curl -X GET https://{host}/open/api/all_trade?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=266a90452a352a1c674df2e0b18cc9e9\&time=1554184381\&symbol=mkreth\&pageSize=10\&page=1
```
    
- example
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"count": 6,
		"resultList": [{
			"side": "SELL",
			"ask_user_id": 2,
			"fee": "0.00000000",
			"deal_price": "2.48179933",
			"type": "sell out",
			"bid_id": 1,
			"ask_id": 2,
			"volume": "0.500",
			"feeCoin": "ETH",
			"price": "4.96359866",
			"ctime": 1551812066276,
			"id": 1,
			"bid_user_id": 2
		}]
	}
}
```
