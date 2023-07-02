.class public final Lt3/t$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lt3/l$a;

.field private c:Lt3/p0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lt3/u$b;

    invoke-direct {v0}, Lt3/u$b;-><init>()V

    invoke-direct {p0, p1, v0}, Lt3/t$a;-><init>(Landroid/content/Context;Lt3/l$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lt3/l$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lt3/t$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lt3/t$a;->b:Lt3/l$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lt3/l;
    .locals 1

    invoke-virtual {p0}, Lt3/t$a;->b()Lt3/t;

    move-result-object v0

    return-object v0
.end method

.method public b()Lt3/t;
    .locals 3

    new-instance v0, Lt3/t;

    iget-object v1, p0, Lt3/t$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lt3/t$a;->b:Lt3/l$a;

    invoke-interface {v2}, Lt3/l$a;->a()Lt3/l;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lt3/t;-><init>(Landroid/content/Context;Lt3/l;)V

    iget-object v1, p0, Lt3/t$a;->c:Lt3/p0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lt3/t;->c(Lt3/p0;)V

    :cond_0
    return-object v0
.end method
