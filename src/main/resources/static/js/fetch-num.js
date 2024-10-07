document.getElementById('numForm').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const number = {
        num: document.getElementById('num_id').value,
    };

    fetch('/hello', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(number)
    })
    .then(response => {
        if (response.ok) {
            alert('메시지가 성공적으로 생성되었습니다.');
            document.getElementById('numForm').reset();
        } else {
            alert('메시지 생성에 실패했습니다.');
        }
    })
    .catch(error => {
        console.error('Error:', error);
        alert('오류가 발생했습니다.');
    });
});