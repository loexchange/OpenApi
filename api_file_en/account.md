# Inquire the information of personal assets 
- request method: GET
- url: https://{host}/open/api/user/account
- input parameter
```
api_key={api_key}&time={time}&sign={sign}
```
- entry instructions

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | api_key | interface key | * |
  | sign | signature data | * |
  | time | current timestamp | * |
   
- command
```
curl -X GET https://{host}/open/api/user/account?sign=a7c476df2de02811166cda6edb20869a&api_key=1764ddfe62ab365092296ad8272df4f9&time=1554178351
```
- return information

    | the field names | type of data | instructions |
    | --- | --- | --- |
    | code | code | 0=succeed，otherwise fail |
    | msg | content | suc=succeed，otherwise return to specific information |
    | total_asset | total asset | assets after successful conversion of BTC |
    | normal | normal balance | available balance |
    | btcValuatin | conversion asset | assets converted into BTC |
    | locked | frozen asset  | frozen assets that cannot be used |
    | coin | coin | &nbsp; |
    
- example
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"total_asset": "12270.21335696",
		"coin_list": [{
			"normal": "10519.66036000",
			"btcValuatin": "373.08510973",
			"locked": "2.82130000",
			"coin": "eth"
		} {
			"normal": "10095.74398000",
			"btcValuatin": "10100.00000000",
			"locked": "4.25602000",
			"coin": "btc"
		}]
	}
}
```
