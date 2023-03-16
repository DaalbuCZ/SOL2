.class public Ly0/l2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ly0/s2;

.field private final b:Ly0/t;

.field private final c:J

.field private final d:Ly0/x0;

.field private final e:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\{\"bf_start_date\":(\\d+),\"bf_end_date\":(\\d+)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ly0/l2;->f:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ly0/s2;Ly0/t;JLjava/util/concurrent/atomic/AtomicLong;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/l2;->a:Ly0/s2;

    iput-object p2, p0, Ly0/l2;->b:Ly0/t;

    iput-wide p3, p0, Ly0/l2;->c:J

    iput-object p5, p0, Ly0/l2;->e:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Ly0/x0;

    invoke-direct {p1}, Ly0/x0;-><init>()V

    iput-object p1, p0, Ly0/l2;->d:Ly0/x0;

    return-void
.end method

.method private b(Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 3

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/FileReader;

    invoke-direct {v1, p1}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    if-nez p3, :cond_0

    iget-object p3, p0, Ly0/l2;->d:Ly0/x0;

    invoke-virtual {p3, v1}, Ly0/x0;->d(Ljava/lang/String;)Ly0/n0;

    move-result-object p3

    invoke-virtual {p3}, Ly0/n0;->b()Ljava/util/Date;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    :cond_0
    iget-object v0, p0, Ly0/l2;->d:Ly0/x0;

    invoke-virtual {v0, p2}, Ly0/x0;->d(Ljava/lang/String;)Ly0/n0;

    move-result-object p2

    invoke-virtual {p2}, Ly0/n0;->b()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "bf_start_date"

    invoke-virtual {p2, v2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "bf_end_date"

    invoke-virtual {p2, p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    new-instance p3, Ljava/util/Date;

    invoke-direct {p3}, Ljava/util/Date;-><init>()V

    new-instance v0, Ly0/n0$b;

    invoke-direct {v0}, Ly0/n0$b;-><init>()V

    iget-object v1, p0, Ly0/l2;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ly0/n0$b;->b(J)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {v0, p3}, Ly0/n0$b;->d(Ljava/util/Date;)Ly0/n0$b;

    move-result-object p3

    sget-object v0, Ly0/n0$c;->o:Ly0/n0$c;

    invoke-virtual {v0}, Ly0/n0$c;->e()I

    move-result v0

    invoke-virtual {p3, v0}, Ly0/n0$b;->a(I)Ly0/n0$b;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Ly0/n0$b;->f(I)Ly0/n0$b;

    move-result-object p3

    const-string v0, ""

    invoke-virtual {p3, v0}, Ly0/n0$b;->j(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p3

    invoke-virtual {p3, v0}, Ly0/n0$b;->k(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p3

    const-string v1, "bf_gap_log"

    invoke-virtual {p3, v1}, Ly0/n0$b;->h(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p3

    invoke-virtual {p3, v0}, Ly0/n0$b;->c(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p3

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ly0/n0$b;->i(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p2

    invoke-virtual {p2}, Ly0/n0$b;->e()Ly0/n0;

    move-result-object p2

    iget-object p3, p0, Ly0/l2;->d:Ly0/x0;

    invoke-virtual {p3, p2}, Ly0/x0;->c(Ly0/n0;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Ly0/l2;->b:Ly0/t;

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ly0/t;->e(J)V

    iget-object p3, p0, Ly0/l2;->b:Ly0/t;

    invoke-static {p2}, Ly0/a3;->b(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p3, v0, v1}, Ly0/t;->b(J)V

    new-instance p3, Ljava/io/PrintWriter;

    invoke-direct {p3, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/File;)V

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/PrintWriter;->close()V

    return-void
.end method

.method private c(Ly0/z1;Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/z1;",
            "Ljava/util/List<",
            "Ly0/z1;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :catch_0
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/z1;

    invoke-virtual {v0}, Ly0/z1;->g()J

    move-result-wide v2

    iget-object v4, p0, Ly0/l2;->a:Ly0/s2;

    sget-object v5, Ly0/s2;->a:Ljava/util/Comparator;

    invoke-interface {v4, v2, v3, v5}, Ly0/s2;->j(JLjava/util/Comparator;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_7

    const/4 v2, 0x0

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    new-instance v3, Ly0/t0;

    sget-object v5, Ly0/i3;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v5}, Ly0/t0;-><init>(Ljava/io/File;Ljava/nio/charset/Charset;)V

    invoke-virtual {v3}, Ly0/t0;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ly0/t0;->close()V

    if-eqz v5, :cond_2

    const-string v3, ""

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    iget-object v6, p0, Ly0/l2;->d:Ly0/x0;

    invoke-virtual {v6, v5}, Ly0/x0;->d(Ljava/lang/String;)Ly0/n0;

    move-result-object v6

    if-nez v6, :cond_3

    :cond_2
    :goto_1
    iget-object p1, p0, Ly0/l2;->a:Ly0/s2;

    invoke-interface {p1, v2}, Ly0/s2;->b(Ljava/io/File;)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {v6}, Ly0/n0;->h()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v6}, Ly0/n0;->h()Ljava/lang/String;

    move-result-object v3

    :cond_4
    sget-object v6, Ly0/l2;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-nez v6, :cond_5

    const/4 p1, 0x0

    invoke-direct {p0, v2, v5, p1}, Ly0/l2;->b(Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;)V

    return v1

    :cond_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-le v6, v1, :cond_6

    new-instance p1, Ljava/util/Date;

    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-direct {p1, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/io/File;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p2, v5, p1}, Ly0/l2;->b(Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_1

    :cond_6
    :try_start_0
    iget-object v1, p0, Ly0/l2;->a:Ly0/s2;

    invoke-interface {v1, v0}, Ly0/s2;->n(Ly0/z1;)Ly0/z2;

    move-result-object v1

    invoke-virtual {v1}, Ly0/z2;->c()Z
    :try_end_0
    .catch Ly0/e3; {:try_start_0 .. :try_end_0} :catch_1

    :catch_1
    :try_start_1
    iget-object v1, p0, Ly0/l2;->a:Ly0/s2;

    invoke-interface {v1, v0}, Ly0/s2;->f(Ly0/z1;)Ly0/z2;

    move-result-object v0

    invoke-virtual {v0}, Ly0/z2;->c()Z
    :try_end_1
    .catch Ly0/e3; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :cond_7
    invoke-virtual {p1}, Ly0/z1;->g()J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly0/l2;->a:Ly0/s2;

    invoke-interface {v0, v2, v3}, Ly0/s2;->p(J)Z

    goto/16 :goto_0

    :cond_8
    invoke-direct {p0}, Ly0/l2;->d()V

    return v1
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Ly0/l2;->a:Ly0/s2;

    invoke-interface {v0}, Ly0/s2;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ly0/l2;->a:Ly0/s2;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/z1;

    invoke-virtual {v0}, Ly0/z1;->g()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Ly0/s2;->p(J)Z

    :cond_0
    return-void
.end method

.method private e()Z
    .locals 4

    iget-object v0, p0, Ly0/l2;->a:Ly0/s2;

    invoke-interface {v0}, Ly0/s2;->h()J

    move-result-wide v0

    iget-wide v2, p0, Ly0/l2;->c:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 2

    :goto_0
    invoke-direct {p0}, Ly0/l2;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly0/l2;->a:Ly0/s2;

    invoke-interface {v0}, Ly0/s2;->c()Ly0/z1;

    move-result-object v0

    iget-object v1, p0, Ly0/l2;->a:Ly0/s2;

    invoke-interface {v1}, Ly0/s2;->d()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ly0/l2;->c(Ly0/z1;Ljava/util/List;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly0/l2;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
