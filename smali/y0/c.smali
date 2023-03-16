.class public Ly0/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/c$a;,
        Ly0/c$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ly0/c$b;

.field private c:Ly0/c$a;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ly0/c$a;
    .locals 1

    iget-object v0, p0, Ly0/c;->c:Ly0/c$a;

    return-object v0
.end method

.method public b(Ly0/c$a;)V
    .locals 0

    iput-object p1, p0, Ly0/c;->c:Ly0/c$a;

    return-void
.end method

.method public c(Ly0/c$b;)V
    .locals 0

    iput-object p1, p0, Ly0/c;->b:Ly0/c$b;

    return-void
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Ly0/c;->d:Z

    return-void
.end method

.method public e()Ly0/c$b;
    .locals 1

    iget-object v0, p0, Ly0/c;->b:Ly0/c$b;

    return-object v0
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Ly0/c;->a:Z

    return-void
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Ly0/c;->d:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Ly0/c;->a:Z

    return v0
.end method
