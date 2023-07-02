.class public interface abstract Ld1/s2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld1/s2$a;

    invoke-direct {v0}, Ld1/s2$a;-><init>()V

    sput-object v0, Ld1/s2;->a:Ljava/util/Comparator;

    const-string v0, "logs-([\\d]+)\\.json"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ld1/s2;->b:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld1/z1;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/io/File;)Z
.end method

.method public abstract c()Ld1/z1;
.end method

.method public abstract c(Ld1/z1;)Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            ")",
            "Ld1/z2<",
            "Ld1/n0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld1/z1;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e()Ld1/k3;
.end method

.method public abstract f()Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/z2<",
            "Ld1/d3;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(J)Z
.end method

.method public abstract g()Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/z2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h()J
.end method

.method public abstract i()Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/z2<",
            "Ld1/n0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract j(JLjava/util/Comparator;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end method

.method public abstract k(Ld1/z1;)Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            ")",
            "Ld1/z2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract l(Ld1/k3;)V
.end method

.method public abstract m(J)V
.end method

.method public abstract n(Ld1/z1;)V
.end method

.method public abstract o(Ld1/z1;)Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            ")",
            "Ld1/z2<",
            "Ld1/d3;",
            ">;"
        }
    .end annotation
.end method

.method public abstract p(JJ)V
.end method

.method public abstract q(J)Z
.end method
