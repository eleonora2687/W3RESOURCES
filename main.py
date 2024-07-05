# import urllib
# from datetime import datetime
# from urllib import request
#
#
# from flask import Flask, redirect, jsonify, session
#
# app = Flask(__name__)
#
# app.secret_key = '2134565-324fdg-wqert3-`21345dfgh'
#
# CLIENT_ID ='921fea7754a647aba3be07a3286b93cb'
# CLIENT_SECRET = '219cdbc7bfb24bfaaeb77850b4c0f62e'
# REDIRECT_URI = 'HTTP://localhost:5000/callback'
#
# AUTH_URL='https://accounts.spotify.com/authorize'
# TOKEN_URL='https://accounts.spotify.com/api/token'
#
# API_BASE_URL = 'https://api.spotify.com/v1/'
#
# @app.route('/')
# def index():
#     return 'Welcome to Spotify! <a href="/login">Login with Spotify</a>'
#
# @app.route('/login')
# def login():
#     scope = 'user-read-private user-read-email'
#     params = {
#         'client_id': CLIENT_ID,
#         'scope': scope,
#         'redirect_uri': REDIRECT_URI,
#         'response_type': 'code',
#         'show_dialog': True
#     }
#
#     auth_url = f"{AUTH_URL}?{urllib.parse.urlencode(params)}"
#
#     return redirect(auth_url)
#
#
# @app.route('/callback')
# def callback():
#     if 'error' in request.args:
#         return  jsonify({'error':request.args['error']})
#
#     if 'code' in request.args:
#         req_body = {
#             'code': request.args['code'],
#             'grant_type': 'authorization_code',
#             'redirect_uri': REDIRECT_URI,
#             'client_id': CLIENT_ID,
#             'client_secret': CLIENT_SECRET
#
#         }
#
#         import requests
#         response = requests.post(TOKEN_URL, data=req_body)
#         token_info = response.json()
#
#         session['access_token'] = token_info['access_token']
#
#         session['refresh_token'] = token_info['refresh_token']
#         session['expires_at'] = datetime.now().timestamp() + token_info['expires_token']
#
#         return redirect('/playlists')
# @app.route('/playlists')
# def playlists():
#     if 'access_token' not in session:
#         return redirect('/login')
#
#     if datetime.now().timestamp() > session['expires_at']:
#         return redirect('/refresh-token')
#
#     headers = {'Authorization': 'Bearer {0}'.format(session['access_token'])}
#     import requests
#     response = requests.get(API_BASE_URL + 'me/playlists', headers=headers)
#     playlists = response.json()
#     return jsonify(playlists)
#
# @app.route('/refresh-token')
# def refresh_token():
#     if 'refresh_token' not in session:
#         return redirect('/login')
#
#     if datetime.now().timestamp() > session['expires_at']:
#         req_body ={
#             'grant_type': 'refresh_token',
#             'refresh_token': session['refresh_token'],
#             'client_id': CLIENT_ID,
#             'client_secret': CLIENT_SECRET
#
#         }
#         import requests
#         response = requests.post(TOKEN_URL, data=req_body)
#         token_info = response.json()
#         session['access_token'] = token_info['access_token']
#         session['refresh_token'] = token_info['refresh_token']
#         session['expires_at'] = datetime.now().timestamp() + token_info['expires_token']
#         return redirect('/playlists')
#
# if __name__ == '__main__':
#     app.run(host='0.0.0.0',debug=True)
#


import requests
import base64

client_id = 'b8d862cf723b44978761e361048248ea'
client_secret = 'c539d91a68d243eb822b07ff0a680cd7'

auth_options = {
    'url': 'https://accounts.spotify.com/api/token',
    'headers': {
        'Authorization': 'Basic ' + base64.b64encode((client_id + ':' + client_secret).encode()).decode()
    },
    'data': {
        'grant_type': 'client_credentials'
    },
    'json': True
}

response = requests.post(auth_options['url'], headers=auth_options['headers'], data=auth_options['data'])

if response.status_code == 200:
    token = response.json()['access_token']
