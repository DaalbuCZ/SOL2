.class public Ly0/k3$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/k3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ly0/k3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    sget-object p1, Ly0/k3;->d:Ly0/k3;

    :cond_0
    invoke-virtual {p1}, Ly0/k3;->c()Z

    move-result v0

    iput-boolean v0, p0, Ly0/k3$b;->a:Z

    invoke-virtual {p1}, Ly0/k3;->a()I

    move-result v0

    iput v0, p0, Ly0/k3$b;->c:I

    invoke-virtual {p1}, Ly0/k3;->b()Z

    move-result p1

    iput-boolean p1, p0, Ly0/k3$b;->b:Z

    return-void
.end method


# virtual methods
.method public a(I)Ly0/k3$b;
    .locals 0

    iput p1, p0, Ly0/k3$b;->c:I

    return-object p0
.end method

.method public b(Z)Ly0/k3$b;
    .locals 0

    iput-boolean p1, p0, Ly0/k3$b;->a:Z

    return-object p0
.end method

.method public c()Ly0/k3;
    .locals 5

    new-instance v0, Ly0/k3;

    iget-boolean v1, p0, Ly0/k3$b;->a:Z

    iget-boolean v2, p0, Ly0/k3$b;->b:Z

    iget v3, p0, Ly0/k3$b;->c:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ly0/k3;-><init>(ZZILy0/k3$a;)V

    return-object v0
.end method

.method public d(Z)Ly0/k3$b;
    .locals 0

    iput-boolean p1, p0, Ly0/k3$b;->b:Z

    return-object p0
.end method
