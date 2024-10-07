// /js/utils.js
const baseUrl = getBaseUrl();

function fetchMessages() {
	const messageList = document.getElementById("messageList_id");
	const loading = document.getElementById("loading_id");
	const error = document.getElementById("error_id");
	
	error.style.display = 'none';
	messageList.innerHTML = '';
	
	fetch(baseUrl + '/messages/api')
		.then(response => {
			if(!response.ok) {
				throw new Error('Network response was not ok');
			}
			return response.json();
		})
		.then(messages => {
			loading.style.display = 'none';
			messages.forEach(msg => {
				const li = document.createElement('li');
				li.innerHTML = `<a href="/messages/${msg.id}">${msg.message} (${msg.id})</a>`;
				messageList.appendChild(li);
			})
		})
		.catch(err => {
			console.error('Fetch error:', error);
			loading.style.display = 'none';
			error.style.display = 'block';
		});
}

// 문서가 모두 로딩되면 fetchMessage() 함수를 실행
document.addEventListener('DOMContentLoaded', fetchMessages);