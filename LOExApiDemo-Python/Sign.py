import hashlib
import time

m = hashlib.md5()

api_key = ''
api_secret = ''

params = {'api_key':api_key, 'time':int(time.time()), 'symbol':'btclcny'}

def sign( data , secret ):
	signStr = ""
	keys = data.keys()
	keys = sorted(keys)
	for key in keys:
		signStr = signStr + key
		signStr = signStr + bytes(data[key])
		pass
	signStr += secret
	m.update(signStr)
	return m.hexdigest()

print sign( params , api_secret )