.class Lh7/d$a;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/d;->create(Lf7/e;Lm7/a;)Lf7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf7/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private a:Lf7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Lf7/e;

.field final synthetic e:Lm7/a;

.field final synthetic f:Lh7/d;


# direct methods
.method constructor <init>(Lh7/d;ZZLf7/e;Lm7/a;)V
    .locals 0

    iput-object p1, p0, Lh7/d$a;->f:Lh7/d;

    iput-boolean p2, p0, Lh7/d$a;->b:Z

    iput-boolean p3, p0, Lh7/d$a;->c:Z

    iput-object p4, p0, Lh7/d$a;->d:Lf7/e;

    iput-object p5, p0, Lh7/d$a;->e:Lm7/a;

    invoke-direct {p0}, Lf7/w;-><init>()V

    return-void
.end method

.method private f()Lf7/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lh7/d$a;->a:Lf7/w;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh7/d$a;->d:Lf7/e;

    iget-object v1, p0, Lh7/d$a;->f:Lh7/d;

    iget-object v2, p0, Lh7/d$a;->e:Lm7/a;

    invoke-virtual {v0, v1, v2}, Lf7/e;->l(Lf7/x;Lm7/a;)Lf7/w;

    move-result-object v0

    iput-object v0, p0, Lh7/d$a;->a:Lf7/w;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public c(Ln7/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/a;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh7/d$a;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ln7/a;->j0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0}, Lh7/d$a;->f()Lf7/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ln7/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/c;",
            "TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lh7/d$a;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ln7/c;->D()Ln7/c;

    return-void

    :cond_0
    invoke-direct {p0}, Lh7/d$a;->f()Lf7/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    return-void
.end method
