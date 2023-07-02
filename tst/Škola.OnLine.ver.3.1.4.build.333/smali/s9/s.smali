.class public Ls9/s;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ls9/t;

.field private static final b:[Lw9/b;


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

    check-cast v1, Ls9/t;
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
    new-instance v0, Ls9/t;

    invoke-direct {v0}, Ls9/t;-><init>()V

    :goto_0
    sput-object v0, Ls9/s;->a:Ls9/t;

    const/4 v0, 0x0

    new-array v0, v0, [Lw9/b;

    sput-object v0, Ls9/s;->b:[Lw9/b;

    return-void
.end method

.method public static a(Ls9/i;)Lw9/d;
    .locals 1

    sget-object v0, Ls9/s;->a:Ls9/t;

    invoke-virtual {v0, p0}, Ls9/t;->a(Ls9/i;)Lw9/d;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lw9/b;
    .locals 1

    sget-object v0, Ls9/s;->a:Ls9/t;

    invoke-virtual {v0, p0}, Ls9/t;->b(Ljava/lang/Class;)Lw9/b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lw9/c;
    .locals 2

    sget-object v0, Ls9/s;->a:Ls9/t;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Ls9/t;->c(Ljava/lang/Class;Ljava/lang/String;)Lw9/c;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ls9/n;)Lw9/e;
    .locals 1

    sget-object v0, Ls9/s;->a:Ls9/t;

    invoke-virtual {v0, p0}, Ls9/t;->d(Ls9/n;)Lw9/e;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ls9/h;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ls9/s;->a:Ls9/t;

    invoke-virtual {v0, p0}, Ls9/t;->e(Ls9/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ls9/l;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ls9/s;->a:Ls9/t;

    invoke-virtual {v0, p0}, Ls9/t;->f(Ls9/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
