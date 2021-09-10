call next value for hibernate_sequence; -- 우리가 1, 2, 3,.. 을 지정해서 알려주지 않으면 save()를 할 때 에러가 난다..? mysql 에서는 다른 방법을 사용해서 PKfmf
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (1, 'kayoung', 'rkdkdudjd@google.com', now(), now());

call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (2, 'dennis', 'dinnis@google.com', now(), now());

call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (3, 'sophia', 'sophia@google.com', now(), now());

call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (4, 'james', 'james@google.com', now(), now());

call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (5, 'kayoung', 'rkdkdudjd@another.com', now(), now());



