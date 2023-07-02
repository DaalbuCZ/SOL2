.class public Ld1/q2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/q2$c;,
        Ld1/q2$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Ljava/lang/Thread;

.field private final c:Ljava/lang/Throwable;

.field private final d:Ljava/util/Date;


# direct methods
.method private constructor <init>(Ld1/q2$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Ld1/q2;->a:Ljava/util/UUID;

    invoke-static {p1}, Ld1/q2$b;->e(Ld1/q2$b;)Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ld1/q2;->b:Ljava/lang/Thread;

    invoke-static {p1}, Ld1/q2$b;->f(Ld1/q2$b;)Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Ld1/q2;->c:Ljava/lang/Throwable;

    invoke-static {p1}, Ld1/q2$b;->g(Ld1/q2$b;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Ld1/q2;->d:Ljava/util/Date;

    return-void
.end method

.method synthetic constructor <init>(Ld1/q2$b;Ld1/q2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld1/q2;-><init>(Ld1/q2$b;)V

    return-void
.end method

.method public static a(Ljava/lang/Thread;Ljava/lang/Throwable;)Ld1/q2;
    .locals 1

    new-instance v0, Ld1/q2$b;

    invoke-direct {v0}, Ld1/q2$b;-><init>()V

    invoke-virtual {v0, p1}, Ld1/q2$b;->b(Ljava/lang/Throwable;)Ld1/q2$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Ld1/q2$b;->a(Ljava/lang/Thread;)Ld1/q2$b;

    move-result-object p0

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0, p1}, Ld1/q2$b;->c(Ljava/util/Date;)Ld1/q2$b;

    move-result-object p0

    invoke-virtual {p0}, Ld1/q2$b;->d()Ld1/q2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 4

    :try_start_0
    new-instance v0, Ld1/q2$c;

    iget-object v1, p0, Ld1/q2;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1}, Ld1/q2$c;-><init>(Ljava/lang/Throwable;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "id"

    iget-object v3, p0, Ld1/q2;->a:Ljava/util/UUID;

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "title"

    invoke-virtual {v0}, Ld1/q2$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "message"

    invoke-virtual {v0}, Ld1/q2$c;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "date"

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
