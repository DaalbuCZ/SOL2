.class final Lt3/f$a$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/f$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lt3/f$a;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lt3/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/f$a$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lt3/f$a$a$a;->b:Lt3/f$a;

    return-void
.end method

.method static synthetic a(Lt3/f$a$a$a;)Lt3/f$a;
    .locals 0

    iget-object p0, p0, Lt3/f$a$a$a;->b:Lt3/f$a;

    return-object p0
.end method

.method static synthetic b(Lt3/f$a$a$a;)Z
    .locals 0

    iget-boolean p0, p0, Lt3/f$a$a$a;->c:Z

    return p0
.end method

.method static synthetic c(Lt3/f$a$a$a;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lt3/f$a$a$a;->a:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt3/f$a$a$a;->c:Z

    return-void
.end method
