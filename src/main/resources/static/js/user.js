document.getElementById('loginForm_id').addEventListener('submit', function(e) {
	e.preventDefault();

	const user = {
		username: document.getElementById('username_id').value,
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
			if (response.ok) {
				alert('로그인 성공!!!');
				document.getElementById('loginForm_id').reset();
			} else {
				alert('로그인 실패!!!');
			}
		})
		.catch(error => {
			console.error('Error:', error);
			alert('오류가 발생했습니다.');
		});
});