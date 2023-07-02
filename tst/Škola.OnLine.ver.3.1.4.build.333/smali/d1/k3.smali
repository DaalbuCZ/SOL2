.class public Ld1/k3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/k3$b;
    }
.end annotation


# static fields
.field public static final d:Ld1/k3;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld1/k3$b;

    invoke-direct {v0}, Ld1/k3$b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld1/k3$b;->d(Z)Ld1/k3$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Ld1/k3$b;->b(Z)Ld1/k3$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Ld1/k3$b;->a(I)Ld1/k3$b;

    move-result-object v0

    invoke-virtual {v0}, Ld1/k3$b;->c()Ld1/k3;

    move-result-object v0

    sput-object v0, Ld1/k3;->d:Ld1/k3;

    return-void
.end method

.method private constructor <init>(ZZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld1/k3;->a:Z

    iput-boolean p2, p0, Ld1/k3;->b:Z

    iput p3, p0, Ld1/k3;->c:I

    return-void
.end method

.method synthetic constructor <init>(ZZILd1/k3$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld1/k3;-><init>(ZZI)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Ld1/k3;->c:I

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ld1/k3;->b:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Ld1/k3;->a:Z

    return v0
.end method
