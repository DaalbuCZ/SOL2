.class public final Lj$/time/format/DateTimeFormatter;
.super Ljava/lang/Object;


# static fields
.field public static final ISO_LOCAL_DATE:Lj$/time/format/DateTimeFormatter;

.field public static final ISO_LOCAL_DATE_TIME:Lj$/time/format/DateTimeFormatter;

.field public static final h:Lj$/time/format/DateTimeFormatter;


# instance fields
.field private final a:Lj$/time/format/f;

.field private final b:Ljava/util/Locale;

.field private final c:Lj$/time/format/x;

.field private final d:Lj$/time/format/z;

.field private final e:Ljava/util/Set;

.field private final f:Lj$/time/chrono/f;

.field private final g:Lj$/time/ZoneId;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lj$/time/format/r;

    invoke-direct {v0}, Lj$/time/format/r;-><init>()V

    sget-object v1, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    const/4 v2, 0x4

    const/16 v3, 0xa

    const/4 v4, 0x5

    invoke-virtual {v0, v1, v2, v3, v4}, Lj$/time/format/r;->l(Lj$/time/temporal/o;III)Lj$/time/format/r;

    const/16 v5, 0x2d

    invoke-virtual {v0, v5}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    sget-object v6, Lj$/time/temporal/a;->MONTH_OF_YEAR:Lj$/time/temporal/a;

    const/4 v7, 0x2

    invoke-virtual {v0, v6, v7}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v0, v5}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    sget-object v8, Lj$/time/temporal/a;->DAY_OF_MONTH:Lj$/time/temporal/a;

    invoke-virtual {v0, v8, v7}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    sget-object v9, Lj$/time/format/z;->STRICT:Lj$/time/format/z;

    sget-object v10, Lj$/time/chrono/g;->a:Lj$/time/chrono/g;

    invoke-virtual {v0, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lj$/time/format/DateTimeFormatter;->ISO_LOCAL_DATE:Lj$/time/format/DateTimeFormatter;

    new-instance v11, Lj$/time/format/r;

    invoke-direct {v11}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v11}, Lj$/time/format/r;->p()Lj$/time/format/r;

    invoke-virtual {v11, v0}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->h()Lj$/time/format/r;

    invoke-virtual {v11, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v11, Lj$/time/format/r;

    invoke-direct {v11}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v11}, Lj$/time/format/r;->p()Lj$/time/format/r;

    invoke-virtual {v11, v0}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->h()Lj$/time/format/r;

    invoke-virtual {v11, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v11, Lj$/time/format/r;

    invoke-direct {v11}, Lj$/time/format/r;-><init>()V

    sget-object v12, Lj$/time/temporal/a;->HOUR_OF_DAY:Lj$/time/temporal/a;

    invoke-virtual {v11, v12, v7}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    const/16 v13, 0x3a

    invoke-virtual {v11, v13}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    sget-object v14, Lj$/time/temporal/a;->MINUTE_OF_HOUR:Lj$/time/temporal/a;

    invoke-virtual {v11, v14, v7}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v11, v13}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    sget-object v15, Lj$/time/temporal/a;->SECOND_OF_MINUTE:Lj$/time/temporal/a;

    invoke-virtual {v11, v15, v7}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->o()Lj$/time/format/r;

    sget-object v13, Lj$/time/temporal/a;->NANO_OF_SECOND:Lj$/time/temporal/a;

    const/4 v7, 0x0

    const/16 v5, 0x9

    const/4 v2, 0x1

    invoke-virtual {v11, v13, v7, v5, v2}, Lj$/time/format/r;->b(Lj$/time/temporal/o;IIZ)Lj$/time/format/r;

    const/4 v5, 0x0

    invoke-virtual {v11, v9, v5}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    move-result-object v7

    new-instance v11, Lj$/time/format/r;

    invoke-direct {v11}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v11}, Lj$/time/format/r;->p()Lj$/time/format/r;

    invoke-virtual {v11, v7}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->h()Lj$/time/format/r;

    invoke-virtual {v11, v9, v5}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v11, Lj$/time/format/r;

    invoke-direct {v11}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v11}, Lj$/time/format/r;->p()Lj$/time/format/r;

    invoke-virtual {v11, v7}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->h()Lj$/time/format/r;

    invoke-virtual {v11, v9, v5}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v11, Lj$/time/format/r;

    invoke-direct {v11}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v11}, Lj$/time/format/r;->p()Lj$/time/format/r;

    invoke-virtual {v11, v0}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    const/16 v0, 0x54

    invoke-virtual {v11, v0}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v11, v7}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    invoke-virtual {v11, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lj$/time/format/DateTimeFormatter;->ISO_LOCAL_DATE_TIME:Lj$/time/format/DateTimeFormatter;

    new-instance v7, Lj$/time/format/r;

    invoke-direct {v7}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v7}, Lj$/time/format/r;->p()Lj$/time/format/r;

    invoke-virtual {v7, v0}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    invoke-virtual {v7}, Lj$/time/format/r;->h()Lj$/time/format/r;

    invoke-virtual {v7, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    move-result-object v7

    new-instance v11, Lj$/time/format/r;

    invoke-direct {v11}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v11, v7}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->o()Lj$/time/format/r;

    const/16 v7, 0x5b

    invoke-virtual {v11, v7}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->q()Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->m()Lj$/time/format/r;

    const/16 v13, 0x5d

    invoke-virtual {v11, v13}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v11, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v11, Lj$/time/format/r;

    invoke-direct {v11}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v11, v0}, Lj$/time/format/r;->a(Lj$/time/format/DateTimeFormatter;)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->h()Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v11, v7}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->q()Lj$/time/format/r;

    invoke-virtual {v11}, Lj$/time/format/r;->m()Lj$/time/format/r;

    invoke-virtual {v11, v13}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v11, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v0, Lj$/time/format/r;

    invoke-direct {v0}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v0}, Lj$/time/format/r;->p()Lj$/time/format/r;

    const/4 v7, 0x4

    invoke-virtual {v0, v1, v7, v3, v4}, Lj$/time/format/r;->l(Lj$/time/temporal/o;III)Lj$/time/format/r;

    const/16 v7, 0x2d

    invoke-virtual {v0, v7}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    sget-object v7, Lj$/time/temporal/a;->DAY_OF_YEAR:Lj$/time/temporal/a;

    const/4 v11, 0x3

    invoke-virtual {v0, v7, v11}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v0}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v0}, Lj$/time/format/r;->h()Lj$/time/format/r;

    invoke-virtual {v0, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v0, Lj$/time/format/r;

    invoke-direct {v0}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v0}, Lj$/time/format/r;->p()Lj$/time/format/r;

    sget-object v7, Lj$/time/temporal/j;->c:Lj$/time/temporal/o;

    const/4 v11, 0x4

    invoke-virtual {v0, v7, v11, v3, v4}, Lj$/time/format/r;->l(Lj$/time/temporal/o;III)Lj$/time/format/r;

    const-string v3, "-W"

    invoke-virtual {v0, v3}, Lj$/time/format/r;->f(Ljava/lang/String;)Lj$/time/format/r;

    sget-object v3, Lj$/time/temporal/j;->b:Lj$/time/temporal/o;

    const/4 v4, 0x2

    invoke-virtual {v0, v3, v4}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    const/16 v3, 0x2d

    invoke-virtual {v0, v3}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    sget-object v3, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    invoke-virtual {v0, v3, v2}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v0}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v0}, Lj$/time/format/r;->h()Lj$/time/format/r;

    invoke-virtual {v0, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v0, Lj$/time/format/r;

    invoke-direct {v0}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v0}, Lj$/time/format/r;->p()Lj$/time/format/r;

    invoke-virtual {v0}, Lj$/time/format/r;->c()Lj$/time/format/r;

    invoke-virtual {v0, v9, v5}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lj$/time/format/DateTimeFormatter;->h:Lj$/time/format/DateTimeFormatter;

    new-instance v0, Lj$/time/format/r;

    invoke-direct {v0}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v0}, Lj$/time/format/r;->p()Lj$/time/format/r;

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v4}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    const/4 v4, 0x2

    invoke-virtual {v0, v6, v4}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v0, v8, v4}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v0}, Lj$/time/format/r;->o()Lj$/time/format/r;

    const-string v4, "+HHMMss"

    const-string v5, "Z"

    invoke-virtual {v0, v4, v5}, Lj$/time/format/r;->g(Ljava/lang/String;Ljava/lang/String;)Lj$/time/format/r;

    invoke-virtual {v0, v9, v10}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "Mon"

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v16, 0x2

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v7, "Tue"

    invoke-virtual {v0, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v16, 0x3

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const-string v9, "Wed"

    invoke-virtual {v0, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v16, 0x4

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v11, "Thu"

    invoke-virtual {v0, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v16, 0x5

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const-string v13, "Fri"

    invoke-virtual {v0, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v16, 0x6

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    const-string v2, "Sat"

    invoke-virtual {v0, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v16, 0x7

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v16, v10

    const-string v10, "Sun"

    invoke-virtual {v0, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    move-object/from16 v17, v15

    const-string v15, "Jan"

    invoke-virtual {v10, v4, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "Feb"

    invoke-virtual {v10, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "Mar"

    invoke-virtual {v10, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "Apr"

    invoke-virtual {v10, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "May"

    invoke-virtual {v10, v11, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "Jun"

    invoke-virtual {v10, v13, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "Jul"

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v4, 0x8

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "Aug"

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v4, 0x9

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "Sep"

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v4, 0xa

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "Oct"

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v4, 0xb

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "Nov"

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v4, 0xc

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "Dec"

    invoke-virtual {v10, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lj$/time/format/r;

    invoke-direct {v2}, Lj$/time/format/r;-><init>()V

    invoke-virtual {v2}, Lj$/time/format/r;->p()Lj$/time/format/r;

    invoke-virtual {v2}, Lj$/time/format/r;->r()Lj$/time/format/r;

    invoke-virtual {v2}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v2, v3, v0}, Lj$/time/format/r;->i(Lj$/time/temporal/o;Ljava/util/Map;)Lj$/time/format/r;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Lj$/time/format/r;->f(Ljava/lang/String;)Lj$/time/format/r;

    invoke-virtual {v2}, Lj$/time/format/r;->n()Lj$/time/format/r;

    const/4 v0, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x4

    invoke-virtual {v2, v8, v0, v3, v4}, Lj$/time/format/r;->l(Lj$/time/temporal/o;III)Lj$/time/format/r;

    const/16 v0, 0x20

    invoke-virtual {v2, v0}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v2, v6, v10}, Lj$/time/format/r;->i(Lj$/time/temporal/o;Ljava/util/Map;)Lj$/time/format/r;

    invoke-virtual {v2, v0}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v2, v1, v4}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v2, v0}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v2, v12, v3}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    const/16 v1, 0x3a

    invoke-virtual {v2, v1}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    invoke-virtual {v2, v14, v3}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v2}, Lj$/time/format/r;->o()Lj$/time/format/r;

    invoke-virtual {v2, v1}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    move-object/from16 v1, v17

    invoke-virtual {v2, v1, v3}, Lj$/time/format/r;->k(Lj$/time/temporal/o;I)Lj$/time/format/r;

    invoke-virtual {v2}, Lj$/time/format/r;->n()Lj$/time/format/r;

    invoke-virtual {v2, v0}, Lj$/time/format/r;->e(C)Lj$/time/format/r;

    const-string v0, "+HHMM"

    const-string v1, "GMT"

    invoke-virtual {v2, v0, v1}, Lj$/time/format/r;->g(Ljava/lang/String;Ljava/lang/String;)Lj$/time/format/r;

    sget-object v0, Lj$/time/format/z;->SMART:Lj$/time/format/z;

    move-object/from16 v1, v16

    invoke-virtual {v2, v0, v1}, Lj$/time/format/r;->t(Lj$/time/format/z;Lj$/time/chrono/f;)Lj$/time/format/DateTimeFormatter;

    return-void
.end method

.method constructor <init>(Lj$/time/format/f;Ljava/util/Locale;Lj$/time/format/x;Lj$/time/format/z;Ljava/util/Set;Lj$/time/chrono/f;Lj$/time/ZoneId;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iput-object p1, p0, Lj$/time/format/DateTimeFormatter;->a:Lj$/time/format/f;

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/time/format/DateTimeFormatter;->e:Ljava/util/Set;

    iput-object p2, p0, Lj$/time/format/DateTimeFormatter;->b:Ljava/util/Locale;

    iput-object p3, p0, Lj$/time/format/DateTimeFormatter;->c:Lj$/time/format/x;

    const-string p2, "resolverStyle"

    .line 2
    invoke-static {p4, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    iput-object p4, p0, Lj$/time/format/DateTimeFormatter;->d:Lj$/time/format/z;

    iput-object p6, p0, Lj$/time/format/DateTimeFormatter;->f:Lj$/time/chrono/f;

    iput-object p1, p0, Lj$/time/format/DateTimeFormatter;->g:Lj$/time/ZoneId;

    return-void
.end method

.method private f(Ljava/lang/CharSequence;Ljava/text/ParsePosition;)Lj$/time/temporal/TemporalAccessor;
    .locals 4

    new-instance p2, Ljava/text/ParsePosition;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ljava/text/ParsePosition;-><init>(I)V

    .line 1
    new-instance v1, Lj$/time/format/s;

    invoke-direct {v1, p0}, Lj$/time/format/s;-><init>(Lj$/time/format/DateTimeFormatter;)V

    invoke-virtual {p2}, Ljava/text/ParsePosition;->getIndex()I

    move-result v2

    iget-object v3, p0, Lj$/time/format/DateTimeFormatter;->a:Lj$/time/format/f;

    invoke-virtual {v3, v1, p1, v2}, Lj$/time/format/f;->b(Lj$/time/format/s;Ljava/lang/CharSequence;I)I

    move-result v2

    if-gez v2, :cond_0

    not-int v1, v2

    invoke-virtual {p2, v1}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v2}, Ljava/text/ParsePosition;->setIndex(I)V

    :goto_0
    if-eqz v1, :cond_2

    .line 2
    invoke-virtual {p2}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result v2

    if-gez v2, :cond_2

    invoke-virtual {p2}, Ljava/text/ParsePosition;->getIndex()I

    move-result v2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lj$/time/format/DateTimeFormatter;->d:Lj$/time/format/z;

    iget-object p2, p0, Lj$/time/format/DateTimeFormatter;->e:Ljava/util/Set;

    invoke-virtual {v1, p1, p2}, Lj$/time/format/s;->s(Lj$/time/format/z;Ljava/util/Set;)Lj$/time/temporal/TemporalAccessor;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v2, 0x40

    if-le v1, v2, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "..."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p2}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result v1

    const-string v2, "Text \'"

    if-ltz v1, :cond_4

    new-instance v1, Lj$/time/format/t;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' could not be parsed at index "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/text/ParsePosition;->getErrorIndex()I

    move-result p2

    invoke-direct {v1, v0, p1, p2}, Lj$/time/format/t;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1

    :cond_4
    new-instance v1, Lj$/time/format/t;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' could not be parsed, unparsed text found at index "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/text/ParsePosition;->getIndex()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/text/ParsePosition;->getIndex()I

    move-result p2

    invoke-direct {v1, v0, p1, p2}, Lj$/time/format/t;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    throw v1
.end method


# virtual methods
.method public a()Lj$/time/chrono/f;
    .locals 1

    iget-object v0, p0, Lj$/time/format/DateTimeFormatter;->f:Lj$/time/chrono/f;

    return-object v0
.end method

.method public b()Lj$/time/format/x;
    .locals 1

    iget-object v0, p0, Lj$/time/format/DateTimeFormatter;->c:Lj$/time/format/x;

    return-object v0
.end method

.method public c()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lj$/time/format/DateTimeFormatter;->b:Ljava/util/Locale;

    return-object v0
.end method

.method public d()Lj$/time/ZoneId;
    .locals 1

    iget-object v0, p0, Lj$/time/format/DateTimeFormatter;->g:Lj$/time/ZoneId;

    return-object v0
.end method

.method public e(Ljava/lang/CharSequence;Lj$/time/temporal/w;)Ljava/lang/Object;
    .locals 5

    const-string v0, "text"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0, p1, v0}, Lj$/time/format/DateTimeFormatter;->f(Ljava/lang/CharSequence;Ljava/text/ParsePosition;)Lj$/time/temporal/TemporalAccessor;

    move-result-object v0

    check-cast v0, Lj$/time/format/y;

    invoke-virtual {v0, p2}, Lj$/time/format/y;->m(Lj$/time/temporal/w;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lj$/time/format/t; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x40

    if-le v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "..."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v2, Lj$/time/format/t;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Text \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' could not be parsed: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p1, v1, p2}, Lj$/time/format/t;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILjava/lang/Throwable;)V

    .line 4
    throw v2

    :catch_1
    move-exception p1

    throw p1
.end method

.method public format(Lj$/time/temporal/TemporalAccessor;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "temporal"

    .line 1
    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    :try_start_0
    new-instance v1, Lj$/time/format/v;

    invoke-direct {v1, p1, p0}, Lj$/time/format/v;-><init>(Lj$/time/temporal/TemporalAccessor;Lj$/time/format/DateTimeFormatter;)V

    iget-object p1, p0, Lj$/time/format/DateTimeFormatter;->a:Lj$/time/format/f;

    invoke-virtual {p1, v1, v0}, Lj$/time/format/f;->a(Lj$/time/format/v;Ljava/lang/StringBuilder;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    new-instance v0, Lj$/time/d;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lj$/time/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method g(Z)Lj$/time/format/f;
    .locals 1

    iget-object v0, p0, Lj$/time/format/DateTimeFormatter;->a:Lj$/time/format/f;

    invoke-virtual {v0, p1}, Lj$/time/format/f;->c(Z)Lj$/time/format/f;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lj$/time/format/DateTimeFormatter;->a:Lj$/time/format/f;

    invoke-virtual {v0}, Lj$/time/format/f;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
