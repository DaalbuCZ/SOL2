.class public Lk9/s;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lk9/t;

.field private static final b:[Lo9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk9/t;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lk9/t;

    invoke-direct {v0}, Lk9/t;-><init>()V

    :goto_0
    sput-object v0, Lk9/s;->a:Lk9/t;

    const/4 v0, 0x0

    new-array v0, v0, [Lo9/b;

    sput-object v0, Lk9/s;->b:[Lo9/b;

    return-void
.end method

.method public static a(Lk9/i;)Lo9/d;
    .locals 1

    sget-object v0, Lk9/s;->a:Lk9/t;

    invoke-virtual {v0, p0}, Lk9/t;->a(Lk9/i;)Lo9/d;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lo9/b;
    .locals 1

    sget-object v0, Lk9/s;->a:Lk9/t;

    invoke-virtual {v0, p0}, Lk9/t;->b(Ljava/lang/Class;)Lo9/b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lo9/c;
    .locals 2

    sget-object v0, Lk9/s;->a:Lk9/t;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lk9/t;->c(Ljava/lang/Class;Ljava/lang/String;)Lo9/c;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lk9/n;)Lo9/e;
    .locals 1

    sget-object v0, Lk9/s;->a:Lk9/t;

    invoke-virtual {v0, p0}, Lk9/t;->d(Lk9/n;)Lo9/e;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lk9/h;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lk9/s;->a:Lk9/t;

    invoke-virtual {v0, p0}, Lk9/t;->e(Lk9/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lk9/l;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lk9/s;->a:Lk9/t;

    invoke-virtual {v0, p0}, Lk9/t;->f(Lk9/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
