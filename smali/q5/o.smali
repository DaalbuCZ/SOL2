.class public Lq5/o;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field static final g:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lq5/w;

.field private final c:Lq5/a;

.field private final d:Ly5/d;

.field private final e:Lx5/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq5/o;->f:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "armeabi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "armeabi-v7a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "arm64-v8a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "x86"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "x86_64"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "18.3.5"

    aput-object v3, v2, v1

    const-string v1, "Crashlytics Android SDK/%s"

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq5/o;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lq5/w;Lq5/a;Ly5/d;Lx5/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/o;->a:Landroid/content/Context;

    iput-object p2, p0, Lq5/o;->b:Lq5/w;

    iput-object p3, p0, Lq5/o;->c:Lq5/a;

    iput-object p4, p0, Lq5/o;->d:Ly5/d;

    iput-object p5, p0, Lq5/o;->e:Lx5/i;

    return-void
.end method

.method private a(Ls5/b0$a;)Ls5/b0$a;
    .locals 5

    iget-object v0, p0, Lq5/o;->e:Lx5/i;

    invoke-interface {v0}, Lx5/i;->b()Lx5/d;

    move-result-object v0

    iget-object v0, v0, Lx5/d;->b:Lx5/d$a;

    iget-boolean v0, v0, Lx5/d$a;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq5/o;->c:Lq5/a;

    iget-object v0, v0, Lq5/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq5/e;

    invoke-static {}, Ls5/b0$a$a;->a()Ls5/b0$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lq5/e;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls5/b0$a$a$a;->d(Ljava/lang/String;)Ls5/b0$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lq5/e;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls5/b0$a$a$a;->b(Ljava/lang/String;)Ls5/b0$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lq5/e;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ls5/b0$a$a$a;->c(Ljava/lang/String;)Ls5/b0$a$a$a;

    move-result-object v2

    invoke-virtual {v2}, Ls5/b0$a$a$a;->a()Ls5/b0$a$a;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ls5/c0;->d(Ljava/util/List;)Ls5/c0;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {}, Ls5/b0$a;->a()Ls5/b0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ls5/b0$a$b;->c(I)Ls5/b0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls5/b0$a$b;->e(Ljava/lang/String;)Ls5/b0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ls5/b0$a$b;->g(I)Ls5/b0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ls5/b0$a$b;->i(J)Ls5/b0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ls5/b0$a$b;->d(I)Ls5/b0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->f()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ls5/b0$a$b;->f(J)Ls5/b0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ls5/b0$a$b;->h(J)Ls5/b0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ls5/b0$a$b;->j(Ljava/lang/String;)Ls5/b0$a$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Ls5/b0$a$b;->b(Ls5/c0;)Ls5/b0$a$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$a$b;->a()Ls5/b0$a;

    move-result-object p1

    return-object p1
.end method

.method private b()Ls5/b0$b;
    .locals 2

    invoke-static {}, Ls5/b0;->b()Ls5/b0$b;

    move-result-object v0

    const-string v1, "18.3.5"

    invoke-virtual {v0, v1}, Ls5/b0$b;->h(Ljava/lang/String;)Ls5/b0$b;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$b;->d(Ljava/lang/String;)Ls5/b0$b;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->b:Lq5/w;

    invoke-virtual {v1}, Lq5/w;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/b0$b;->e(Ljava/lang/String;)Ls5/b0$b;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$b;->b(Ljava/lang/String;)Ls5/b0$b;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$b;->c(Ljava/lang/String;)Ls5/b0$b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ls5/b0$b;->g(I)Ls5/b0$b;

    move-result-object v0

    return-object v0
.end method

.method private static f()I
    .locals 4

    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x7

    if-eqz v1, :cond_0

    return v2

    :cond_0
    sget-object v1, Lq5/o;->f:Ljava/util/Map;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method private g()Ls5/b0$e$d$a$b$a;
    .locals 3

    invoke-static {}, Ls5/b0$e$d$a$b$a;->a()Ls5/b0$e$d$a$b$a$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ls5/b0$e$d$a$b$a$a;->b(J)Ls5/b0$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ls5/b0$e$d$a$b$a$a;->d(J)Ls5/b0$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$e$d$a$b$a$a;->c(Ljava/lang/String;)Ls5/b0$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$e$d$a$b$a$a;->e(Ljava/lang/String;)Ls5/b0$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Ls5/b0$e$d$a$b$a$a;->a()Ls5/b0$e$d$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method private h()Ls5/c0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls5/c0<",
            "Ls5/b0$e$d$a$b$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ls5/b0$e$d$a$b$a;

    invoke-direct {p0}, Lq5/o;->g()Ls5/b0$e$d$a$b$a;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ls5/c0;->g([Ljava/lang/Object;)Ls5/c0;

    move-result-object v0

    return-object v0
.end method

.method private i(ILs5/b0$a;)Ls5/b0$e$d$a;
    .locals 2

    invoke-virtual {p2}, Ls5/b0$a;->c()I

    move-result v0

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Ls5/b0$e$d$a;->a()Ls5/b0$e$d$a$a;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Ls5/b0$e$d$a$a;->b(Ljava/lang/Boolean;)Ls5/b0$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls5/b0$e$d$a$a;->f(I)Ls5/b0$e$d$a$a;

    move-result-object p1

    invoke-direct {p0, p2}, Lq5/o;->n(Ls5/b0$a;)Ls5/b0$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls5/b0$e$d$a$a;->d(Ls5/b0$e$d$a$b;)Ls5/b0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$d$a$a;->a()Ls5/b0$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method private j(ILy5/e;Ljava/lang/Thread;IIZ)Ls5/b0$e$d$a;
    .locals 6

    iget-object v0, p0, Lq5/o;->c:Lq5/a;

    iget-object v0, v0, Lq5/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lq5/o;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lq5/h;->j(Ljava/lang/String;Landroid/content/Context;)Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {}, Ls5/b0$e$d$a;->a()Ls5/b0$e$d$a$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls5/b0$e$d$a$a;->b(Ljava/lang/Boolean;)Ls5/b0$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls5/b0$e$d$a$a;->f(I)Ls5/b0$e$d$a$a;

    move-result-object p1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lq5/o;->o(Ly5/e;Ljava/lang/Thread;IIZ)Ls5/b0$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls5/b0$e$d$a$a;->d(Ls5/b0$e$d$a$b;)Ls5/b0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$d$a$a;->a()Ls5/b0$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method private k(I)Ls5/b0$e$d$c;
    .locals 8

    iget-object v0, p0, Lq5/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lq5/d;->a(Landroid/content/Context;)Lq5/d;

    move-result-object v0

    invoke-virtual {v0}, Lq5/d;->b()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lq5/d;->c()I

    move-result v0

    iget-object v2, p0, Lq5/o;->a:Landroid/content/Context;

    invoke-static {v2}, Lq5/h;->p(Landroid/content/Context;)Z

    move-result v2

    invoke-static {}, Lq5/h;->t()J

    move-result-wide v3

    iget-object v5, p0, Lq5/o;->a:Landroid/content/Context;

    invoke-static {v5}, Lq5/h;->a(Landroid/content/Context;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lq5/h;->b(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {}, Ls5/b0$e$d$c;->a()Ls5/b0$e$d$c$a;

    move-result-object v7

    invoke-virtual {v7, v1}, Ls5/b0$e$d$c$a;->b(Ljava/lang/Double;)Ls5/b0$e$d$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls5/b0$e$d$c$a;->c(I)Ls5/b0$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Ls5/b0$e$d$c$a;->f(Z)Ls5/b0$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls5/b0$e$d$c$a;->e(I)Ls5/b0$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Ls5/b0$e$d$c$a;->g(J)Ls5/b0$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v5, v6}, Ls5/b0$e$d$c$a;->d(J)Ls5/b0$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$d$c$a;->a()Ls5/b0$e$d$c;

    move-result-object p1

    return-object p1
.end method

.method private l(Ly5/e;II)Ls5/b0$e$d$a$b$c;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lq5/o;->m(Ly5/e;III)Ls5/b0$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method private m(Ly5/e;III)Ls5/b0$e$d$a$b$c;
    .locals 5

    iget-object v0, p1, Ly5/e;->b:Ljava/lang/String;

    iget-object v1, p1, Ly5/e;->a:Ljava/lang/String;

    iget-object v2, p1, Ly5/e;->c:[Ljava/lang/StackTraceElement;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-array v2, v3, [Ljava/lang/StackTraceElement;

    :goto_0
    iget-object p1, p1, Ly5/e;->d:Ly5/e;

    if-lt p4, p3, :cond_1

    move-object v4, p1

    :goto_1
    if-eqz v4, :cond_1

    iget-object v4, v4, Ly5/e;->d:Ly5/e;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Ls5/b0$e$d$a$b$c;->a()Ls5/b0$e$d$a$b$c$a;

    move-result-object v4

    invoke-virtual {v4, v0}, Ls5/b0$e$d$a$b$c$a;->f(Ljava/lang/String;)Ls5/b0$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls5/b0$e$d$a$b$c$a;->e(Ljava/lang/String;)Ls5/b0$e$d$a$b$c$a;

    move-result-object v0

    invoke-direct {p0, v2, p2}, Lq5/o;->q([Ljava/lang/StackTraceElement;I)Ls5/c0;

    move-result-object v1

    invoke-static {v1}, Ls5/c0;->d(Ljava/util/List;)Ls5/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/b0$e$d$a$b$c$a;->c(Ls5/c0;)Ls5/b0$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Ls5/b0$e$d$a$b$c$a;->d(I)Ls5/b0$e$d$a$b$c$a;

    move-result-object v0

    if-eqz p1, :cond_2

    if-nez v3, :cond_2

    add-int/lit8 p4, p4, 0x1

    invoke-direct {p0, p1, p2, p3, p4}, Lq5/o;->m(Ly5/e;III)Ls5/b0$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/b0$e$d$a$b$c$a;->b(Ls5/b0$e$d$a$b$c;)Ls5/b0$e$d$a$b$c$a;

    :cond_2
    invoke-virtual {v0}, Ls5/b0$e$d$a$b$c$a;->a()Ls5/b0$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method private n(Ls5/b0$a;)Ls5/b0$e$d$a$b;
    .locals 1

    invoke-static {}, Ls5/b0$e$d$a$b;->a()Ls5/b0$e$d$a$b$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls5/b0$e$d$a$b$b;->b(Ls5/b0$a;)Ls5/b0$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lq5/o;->v()Ls5/b0$e$d$a$b$d;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls5/b0$e$d$a$b$b;->e(Ls5/b0$e$d$a$b$d;)Ls5/b0$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lq5/o;->h()Ls5/c0;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls5/b0$e$d$a$b$b;->c(Ls5/c0;)Ls5/b0$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$d$a$b$b;->a()Ls5/b0$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method private o(Ly5/e;Ljava/lang/Thread;IIZ)Ls5/b0$e$d$a$b;
    .locals 1

    invoke-static {}, Ls5/b0$e$d$a$b;->a()Ls5/b0$e$d$a$b$b;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, p5}, Lq5/o;->y(Ly5/e;Ljava/lang/Thread;IZ)Ls5/c0;

    move-result-object p2

    invoke-virtual {v0, p2}, Ls5/b0$e$d$a$b$b;->f(Ls5/c0;)Ls5/b0$e$d$a$b$b;

    move-result-object p2

    invoke-direct {p0, p1, p3, p4}, Lq5/o;->l(Ly5/e;II)Ls5/b0$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {p2, p1}, Ls5/b0$e$d$a$b$b;->d(Ls5/b0$e$d$a$b$c;)Ls5/b0$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lq5/o;->v()Ls5/b0$e$d$a$b$d;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls5/b0$e$d$a$b$b;->e(Ls5/b0$e$d$a$b$d;)Ls5/b0$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lq5/o;->h()Ls5/c0;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls5/b0$e$d$a$b$b;->c(Ls5/c0;)Ls5/b0$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$d$a$b$b;->a()Ls5/b0$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method private p(Ljava/lang/StackTraceElement;Ls5/b0$e$d$a$b$e$b$a;)Ls5/b0$e$d$a$b$e$b;
    .locals 7

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    int-to-long v3, v0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    int-to-long v1, p1

    :cond_1
    invoke-virtual {p2, v3, v4}, Ls5/b0$e$d$a$b$e$b$a;->e(J)Ls5/b0$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Ls5/b0$e$d$a$b$e$b$a;->f(Ljava/lang/String;)Ls5/b0$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v5}, Ls5/b0$e$d$a$b$e$b$a;->b(Ljava/lang/String;)Ls5/b0$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ls5/b0$e$d$a$b$e$b$a;->d(J)Ls5/b0$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$d$a$b$e$b$a;->a()Ls5/b0$e$d$a$b$e$b;

    move-result-object p1

    return-object p1
.end method

.method private q([Ljava/lang/StackTraceElement;I)Ls5/c0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/StackTraceElement;",
            "I)",
            "Ls5/c0<",
            "Ls5/b0$e$d$a$b$e$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-static {}, Ls5/b0$e$d$a$b$e$b;->a()Ls5/b0$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-virtual {v4, p2}, Ls5/b0$e$d$a$b$e$b$a;->c(I)Ls5/b0$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lq5/o;->p(Ljava/lang/StackTraceElement;Ls5/b0$e$d$a$b$e$b$a;)Ls5/b0$e$d$a$b$e$b;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ls5/c0;->d(Ljava/util/List;)Ls5/c0;

    move-result-object p1

    return-object p1
.end method

.method private r()Ls5/b0$e$a;
    .locals 2

    invoke-static {}, Ls5/b0$e$a;->a()Ls5/b0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->b:Lq5/w;

    invoke-virtual {v1}, Lq5/w;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/b0$e$a$a;->e(Ljava/lang/String;)Ls5/b0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$e$a$a;->g(Ljava/lang/String;)Ls5/b0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$e$a$a;->d(Ljava/lang/String;)Ls5/b0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->b:Lq5/w;

    invoke-virtual {v1}, Lq5/w;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/b0$e$a$a;->f(Ljava/lang/String;)Ls5/b0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->h:Ln5/e;

    invoke-virtual {v1}, Ln5/e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/b0$e$a$a;->b(Ljava/lang/String;)Ls5/b0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lq5/o;->c:Lq5/a;

    iget-object v1, v1, Lq5/a;->h:Ln5/e;

    invoke-virtual {v1}, Ln5/e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/b0$e$a$a;->c(Ljava/lang/String;)Ls5/b0$e$a$a;

    move-result-object v0

    invoke-virtual {v0}, Ls5/b0$e$a$a;->a()Ls5/b0$e$a;

    move-result-object v0

    return-object v0
.end method

.method private s(Ljava/lang/String;J)Ls5/b0$e;
    .locals 1

    invoke-static {}, Ls5/b0$e;->a()Ls5/b0$e$b;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ls5/b0$e$b;->l(J)Ls5/b0$e$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Ls5/b0$e$b;->i(Ljava/lang/String;)Ls5/b0$e$b;

    move-result-object p1

    sget-object p2, Lq5/o;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ls5/b0$e$b;->g(Ljava/lang/String;)Ls5/b0$e$b;

    move-result-object p1

    invoke-direct {p0}, Lq5/o;->r()Ls5/b0$e$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls5/b0$e$b;->b(Ls5/b0$e$a;)Ls5/b0$e$b;

    move-result-object p1

    invoke-direct {p0}, Lq5/o;->u()Ls5/b0$e$e;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls5/b0$e$b;->k(Ls5/b0$e$e;)Ls5/b0$e$b;

    move-result-object p1

    invoke-direct {p0}, Lq5/o;->t()Ls5/b0$e$c;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls5/b0$e$b;->d(Ls5/b0$e$c;)Ls5/b0$e$b;

    move-result-object p1

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Ls5/b0$e$b;->h(I)Ls5/b0$e$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$b;->a()Ls5/b0$e;

    move-result-object p1

    return-object p1
.end method

.method private t()Ls5/b0$e$c;
    .locals 11

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lq5/o;->f()I

    move-result v1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    invoke-static {}, Lq5/h;->t()J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v7, v0

    mul-long/2addr v5, v7

    invoke-static {}, Lq5/h;->z()Z

    move-result v0

    invoke-static {}, Lq5/h;->n()I

    move-result v7

    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v9, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {}, Ls5/b0$e$c;->a()Ls5/b0$e$c$a;

    move-result-object v10

    invoke-virtual {v10, v1}, Ls5/b0$e$c$a;->b(I)Ls5/b0$e$c$a;

    move-result-object v1

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v10}, Ls5/b0$e$c$a;->f(Ljava/lang/String;)Ls5/b0$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Ls5/b0$e$c$a;->c(I)Ls5/b0$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ls5/b0$e$c$a;->h(J)Ls5/b0$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ls5/b0$e$c$a;->d(J)Ls5/b0$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls5/b0$e$c$a;->i(Z)Ls5/b0$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v7}, Ls5/b0$e$c$a;->j(I)Ls5/b0$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Ls5/b0$e$c$a;->e(Ljava/lang/String;)Ls5/b0$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v9}, Ls5/b0$e$c$a;->g(Ljava/lang/String;)Ls5/b0$e$c$a;

    move-result-object v0

    invoke-virtual {v0}, Ls5/b0$e$c$a;->a()Ls5/b0$e$c;

    move-result-object v0

    return-object v0
.end method

.method private u()Ls5/b0$e$e;
    .locals 2

    invoke-static {}, Ls5/b0$e$e;->a()Ls5/b0$e$e$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ls5/b0$e$e$a;->d(I)Ls5/b0$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$e$e$a;->e(Ljava/lang/String;)Ls5/b0$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls5/b0$e$e$a;->b(Ljava/lang/String;)Ls5/b0$e$e$a;

    move-result-object v0

    invoke-static {}, Lq5/h;->A()Z

    move-result v1

    invoke-virtual {v0, v1}, Ls5/b0$e$e$a;->c(Z)Ls5/b0$e$e$a;

    move-result-object v0

    invoke-virtual {v0}, Ls5/b0$e$e$a;->a()Ls5/b0$e$e;

    move-result-object v0

    return-object v0
.end method

.method private v()Ls5/b0$e$d$a$b$d;
    .locals 3

    invoke-static {}, Ls5/b0$e$d$a$b$d;->a()Ls5/b0$e$d$a$b$d$a;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ls5/b0$e$d$a$b$d$a;->d(Ljava/lang/String;)Ls5/b0$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls5/b0$e$d$a$b$d$a;->c(Ljava/lang/String;)Ls5/b0$e$d$a$b$d$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ls5/b0$e$d$a$b$d$a;->b(J)Ls5/b0$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0}, Ls5/b0$e$d$a$b$d$a;->a()Ls5/b0$e$d$a$b$d;

    move-result-object v0

    return-object v0
.end method

.method private w(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Ls5/b0$e$d$a$b$e;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lq5/o;->x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Ls5/b0$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method private x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Ls5/b0$e$d$a$b$e;
    .locals 1

    invoke-static {}, Ls5/b0$e$d$a$b$e;->a()Ls5/b0$e$d$a$b$e$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/b0$e$d$a$b$e$a;->d(Ljava/lang/String;)Ls5/b0$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Ls5/b0$e$d$a$b$e$a;->c(I)Ls5/b0$e$d$a$b$e$a;

    move-result-object p1

    invoke-direct {p0, p2, p3}, Lq5/o;->q([Ljava/lang/StackTraceElement;I)Ls5/c0;

    move-result-object p2

    invoke-static {p2}, Ls5/c0;->d(Ljava/util/List;)Ls5/c0;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls5/b0$e$d$a$b$e$a;->b(Ls5/c0;)Ls5/b0$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$d$a$b$e$a;->a()Ls5/b0$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method private y(Ly5/e;Ljava/lang/Thread;IZ)Ls5/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/e;",
            "Ljava/lang/Thread;",
            "IZ)",
            "Ls5/c0<",
            "Ls5/b0$e$d$a$b$e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Ly5/e;->c:[Ljava/lang/StackTraceElement;

    invoke-direct {p0, p2, p1, p3}, Lq5/o;->x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Ls5/b0$e$d$a$b$e;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Thread;

    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lq5/o;->d:Ly5/d;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/StackTraceElement;

    invoke-interface {v1, p3}, Ly5/d;->a([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    move-result-object p3

    invoke-direct {p0, p4, p3}, Lq5/o;->w(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Ls5/b0$e$d$a$b$e;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ls5/c0;->d(Ljava/util/List;)Ls5/c0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c(Ls5/b0$a;)Ls5/b0$e$d;
    .locals 4

    iget-object v0, p0, Lq5/o;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-static {}, Ls5/b0$e$d;->a()Ls5/b0$e$d$b;

    move-result-object v1

    const-string v2, "anr"

    invoke-virtual {v1, v2}, Ls5/b0$e$d$b;->f(Ljava/lang/String;)Ls5/b0$e$d$b;

    move-result-object v1

    invoke-virtual {p1}, Ls5/b0$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ls5/b0$e$d$b;->e(J)Ls5/b0$e$d$b;

    move-result-object v1

    invoke-direct {p0, p1}, Lq5/o;->a(Ls5/b0$a;)Ls5/b0$a;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lq5/o;->i(ILs5/b0$a;)Ls5/b0$e$d$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Ls5/b0$e$d$b;->b(Ls5/b0$e$d$a;)Ls5/b0$e$d$b;

    move-result-object p1

    invoke-direct {p0, v0}, Lq5/o;->k(I)Ls5/b0$e$d$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls5/b0$e$d$b;->c(Ls5/b0$e$d$c;)Ls5/b0$e$d$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$d$b;->a()Ls5/b0$e$d;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Ls5/b0$e$d;
    .locals 10

    move-object v7, p0

    iget-object v0, v7, Lq5/o;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v8, v0, Landroid/content/res/Configuration;->orientation:I

    new-instance v2, Ly5/e;

    iget-object v0, v7, Lq5/o;->d:Ly5/d;

    move-object v1, p1

    invoke-direct {v2, p1, v0}, Ly5/e;-><init>(Ljava/lang/Throwable;Ly5/d;)V

    invoke-static {}, Ls5/b0$e$d;->a()Ls5/b0$e$d$b;

    move-result-object v0

    move-object v1, p3

    invoke-virtual {v0, p3}, Ls5/b0$e$d$b;->f(Ljava/lang/String;)Ls5/b0$e$d$b;

    move-result-object v0

    move-wide v3, p4

    invoke-virtual {v0, p4, p5}, Ls5/b0$e$d$b;->e(J)Ls5/b0$e$d$b;

    move-result-object v9

    move-object v0, p0

    move v1, v8

    move-object v3, p2

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lq5/o;->j(ILy5/e;Ljava/lang/Thread;IIZ)Ls5/b0$e$d$a;

    move-result-object v0

    invoke-virtual {v9, v0}, Ls5/b0$e$d$b;->b(Ls5/b0$e$d$a;)Ls5/b0$e$d$b;

    move-result-object v0

    invoke-direct {p0, v8}, Lq5/o;->k(I)Ls5/b0$e$d$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/b0$e$d$b;->c(Ls5/b0$e$d$c;)Ls5/b0$e$d$b;

    move-result-object v0

    invoke-virtual {v0}, Ls5/b0$e$d$b;->a()Ls5/b0$e$d;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;J)Ls5/b0;
    .locals 1

    invoke-direct {p0}, Lq5/o;->b()Ls5/b0$b;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lq5/o;->s(Ljava/lang/String;J)Ls5/b0$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/b0$b;->i(Ls5/b0$e;)Ls5/b0$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$b;->a()Ls5/b0;

    move-result-object p1

    return-object p1
.end method
