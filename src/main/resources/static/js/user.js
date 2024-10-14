document.getElementById('loginForm_id').addEventListener('submit', function(e) {
	e.preventDefault();

	const user = {
		usrname: document.getElementById('username_id').value,
		psw: document.getElementById('password_id').value,
	};
	
	fetch('/user/login', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json',
		},
		body: JSON.stringify(user)
	})
		.then(response => {
			return response.json().then(data => ({
				status: response.status,
				data: data
			}))
		})
		.then(({ status, data }) => {
			if (status === 200) {
				alert('로그인에 성공했습니다.');
				//document.getElementById('messageForm').reset();
				window.location.href = '/';
			} else {
				//alert(data.message);
				throw new Error(data.message);
			}
		})
		.catch(error => {
			console.error('Error:', error);
			alert(error.message || '로그인에 실패했습니다.')
		});
});