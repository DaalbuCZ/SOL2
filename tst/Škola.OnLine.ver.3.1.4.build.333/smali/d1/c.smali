.class public Ld1/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/c$a;,
        Ld1/c$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ld1/c$b;

.field private c:Ld1/c$a;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ld1/c$a;
    .locals 1

    iget-object v0, p0, Ld1/c;->c:Ld1/c$a;

    return-object v0
.end method

.method public b(Ld1/c$a;)V
    .locals 0

    iput-object p1, p0, Ld1/c;->c:Ld1/c$a;

    return-void
.end method

.method public c(Ld1/c$b;)V
    .locals 0

    iput-object p1, p0, Ld1/c;->b:Ld1/c$b;

    return-void
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Ld1/c;->d:Z

    return-void
.end method

.method public e()Ld1/c$b;
    .locals 1

    iget-object v0, p0, Ld1/c;->b:Ld1/c$b;

    return-object v0
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Ld1/c;->a:Z

    return-void
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Ld1/c;->d:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Ld1/c;->a:Z

    return v0
.end method
