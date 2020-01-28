# Br-JC1-01-20-8

**Начало работы:**
1. Инициализация. Нажмите Fork на странице https://github.com/Br-JC1-01-20-8/Tasks
2. У вас в аккаунте fork появится тут https://github.com/ваш_логин/Tasks
3. Выберите в IDEA VCS -> Checkout version control -> GitHub и затем:
- укажите ссылку на Ваш fork https://github.com/ваш_логин/Tasks;
- выберите путь к папке проекта;
- после создания проекта один раз выполните команду VCS -> Git -> Rebase my GitHub fork

**Перед каждым сеансом работы:**
1. Получите последние изменения основного репозитория VCS -> Git -> Pull (выберите upstream как источник)
2. Скопируйте папку jсXX__XX с заданиями и тестами (src.jcXX__XX) в свою папку ((src.jcXX__XX.фамилия))
3. Отправьте эти изменения в свой репозиторий VCS -> Git -> Push

**Работаем с кодом:**
1. Добавьте ВСЕ java-файлы вашего пакета под контроль версий (Ctrl+Shift+A или VCS -> Git -> Add)
2. Работайте с кодом. Добейтесь чтобы проект собирался и запускался без ошибок.
3. Делайте коммиты Ctrl+K. _Возврат на пункт 2 нужное число раз_ ;)
4. Отправьте накопленные изменения в свой репозиторий VCS -> Git -> Push

# Если все поломалось!

**Начать все заново нетрудно:**

Найдите свою папку на диске, выделите ее в дереве папок в IDEA. Далее, правая кнопка -> Show in Explorer.

1. Скопируйте свою папку из src/jcXX__XX в отдельное место на диске (обязательно!).
2. Удалите fork из своего аккаунта github (откройте форк на сайте, выберите Setting-Delete this repository)
3. Выполните всю последовательность из шапки (см. Начало работы).
4. Верните свою папку на место в свежем проекте.
5. Делайте коммит Ctrl+K.
6. Отправьте накопленные изменения в свой репозиторий VCS -> Git -> Push