.class public abstract Ls5/b0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls5/b0$b;,
        Ls5/b0$a;,
        Ls5/b0$e;,
        Ls5/b0$c;,
        Ls5/b0$d;
    }
.end annotation


# static fields
.field private static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ls5/b0;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/nio/charset/Charset;
    .locals 1

    sget-object v0, Ls5/b0;->a:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static b()Ls5/b0$b;
    .locals 1

    new-instance v0, Ls5/b$b;

    invoke-direct {v0}, Ls5/b$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Ls5/b0$d;
.end method

.method public abstract h()I
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()Ls5/b0$e;
.end method

.method protected abstract k()Ls5/b0$b;
.end method

.method public l(Ls5/c0;)Ls5/b0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls5/c0<",
            "Ls5/b0$e$d;",
            ">;)",
            "Ls5/b0;"
        }
    .end annotation

    invoke-virtual {p0}, Ls5/b0;->j()Ls5/b0$e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ls5/b0;->k()Ls5/b0$b;

    move-result-object v0

    invoke-virtual {p0}, Ls5/b0;->j()Ls5/b0$e;

    move-result-object v1

    invoke-virtual {v1, p1}, Ls5/b0$e;->o(Ls5/c0;)Ls5/b0$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/b0$b;->i(Ls5/b0$e;)Ls5/b0$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$b;->a()Ls5/b0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Reports without sessions cannot have events added to them."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Ls5/b0$d;)Ls5/b0;
    .locals 2

    invoke-virtual {p0}, Ls5/b0;->k()Ls5/b0$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls5/b0$b;->i(Ls5/b0$e;)Ls5/b0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls5/b0$b;->f(Ls5/b0$d;)Ls5/b0$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$b;->a()Ls5/b0;

    move-result-object p1

    return-object p1
.end method

.method public n(JZLjava/lang/String;)Ls5/b0;
    .locals 2

    invoke-virtual {p0}, Ls5/b0;->k()Ls5/b0$b;

    move-result-object v0

    invoke-virtual {p0}, Ls5/b0;->j()Ls5/b0$e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ls5/b0;->j()Ls5/b0$e;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3, p4}, Ls5/b0$e;->p(JZLjava/lang/String;)Ls5/b0$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/b0$b;->i(Ls5/b0$e;)Ls5/b0$b;

    :cond_0
    invoke-virtual {v0}, Ls5/b0$b;->a()Ls5/b0;

    move-result-object p1

    return-object p1
.end method
