function toggleTheme() {
    const body = document.querySelector('body');
    const isDarkMode = body.classList.contains('dark-mode');
    const button = document.querySelector('.mode');

    if (isDarkMode) {
        body.classList.remove('dark-mode');
        button.innerHTML = '☀️';
        localStorage.setItem('theme', 'light');
    } else {
        body.classList.add('dark-mode');
        button.innerHTML = '🌙';
        localStorage.setItem('theme', 'dark');
    }
}

document.addEventListener('DOMContentLoaded', () => {
    const theme = localStorage.getItem('theme');
    if (theme === 'dark') {
        toggleTheme();
    }
});