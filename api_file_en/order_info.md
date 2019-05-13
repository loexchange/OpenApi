# Query the details of order
- request method: GET
- url: https://{host}/open/api/order_info
-input parameter 
```
api_key={api_key}&order_id={order_id}&symbol={symbol}&time={time}&sign={sign}
```
- entry instruction

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | api_key | interface key | * |
  | sign | signature data | * |
  | symbol | coin pair | * |
  | time | current timestamp | * |
  | order_id | order Id | * |

- command
```
curl -X GET https://{host}/open/api/order_info?symbol=mkreth&api_key=1764ddfe62ab365092296ad8272df4f9&sign=eba1eb0b4d499a2a030dcd22697a7a16&time=1554183546&order_id=1
```
- return information

    | the field names | type of data | instructions |
    | --- | --- | --- |
    | code | code | 0=succeed，otherwise fail |
    | msg | content | suc=succeed，otherwise return to specific information |
    | trade_list | trade list | &nbsp; |
    | order_info | order information | &nbsp; |
    | volume |price | &nbsp; |
    | fee | fee | &nbsp; |
    | deal_price | deal price | &nbsp; |
    | total_price | total price | &nbsp; |
    | created_at | creation time | &nbsp; |
    | total_price | total price | &nbsp; |
    | remain_volume | remain volume | &nbsp; |

- example
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"trade_list": [{
			"volume": "0.50000000",
			"feeCoin": "MKR",
			"price": "4.96359866",
			"fee": "0.00000000",
			"ctime": 1551812066276,
			"deal_price": "2.48179933",
			"id": 1,buy in"
		}, {
			"volume": "0.50000000",
			"feeCoin": "MKR",
			"price": "4.96359866",
			"fee": "0.00000000",
			"ctime": 1551812159755,
			"deal_price": "2.48179933",
			"id": 2,
			"type": "buy in"
		}],
		"order_info": {
			"side": "BUY",
			"total_price": "4.96359866",
			"created_at": 1551862559000,
			"avg_price": "4.96359866",
			"countCoin": "ETH",
			"source": 1,
			"type": 1,
			"side_msg": "buy in",
			"volume": "1.00000000",
			"price": "4.96359866",
			"status_msg": "completed transaction",
			"deal_volume": "1.00000000",
			"id": 1,
			"remain_volume": "0.00000000",
			"baseCoin": "MKR",
			"tradeList": [{
				"volume": "0.50000000",
				"feeCoin": "MKR",
				"price": "4.96359866",
				"fee": "0.00000000",
				"ctime": 1551812066276,
				"deal_price": "2.48179933",
				"id": 1,
				"type": "buy in"
			}, {
				"volume": "0.50000000",
				"feeCoin": "MKR",
				"price": "4.96359866",
				"fee": "0.00000000",
				"ctime": 1551812159755,
				"deal_price": "2.48179933",
				"id": 2,
				"type": "buy in"
			}],
			"status": 2
		}
	}
}
```
