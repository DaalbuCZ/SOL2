.class public Landroidx/core/app/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/h$a;,
        Landroidx/core/app/h$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/core/app/h$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/core/app/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/core/app/h$a;

    invoke-direct {v0, p1}, Landroidx/core/app/h$a;-><init>(I)V

    iput-object v0, p0, Landroidx/core/app/h;->a:Landroidx/core/app/h$b;

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/core/app/h$b;

    invoke-direct {p1}, Landroidx/core/app/h$b;-><init>()V

    iput-object p1, p0, Landroidx/core/app/h;->a:Landroidx/core/app/h$b;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/app/h;->a:Landroidx/core/app/h$b;

    invoke-virtual {v0, p1}, Landroidx/core/app/h$b;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public b()[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/h;->a:Landroidx/core/app/h$b;

    invoke-virtual {v0}, Landroidx/core/app/h$b;->b()[Landroid/util/SparseIntArray;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/h;->a:Landroidx/core/app/h$b;

    invoke-virtual {v0, p1}, Landroidx/core/app/h$b;->c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;

    move-result-object p1

    return-object p1
.end method

.method public d()[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/h;->a:Landroidx/core/app/h$b;

    invoke-virtual {v0}, Landroidx/core/app/h$b;->d()[Landroid/util/SparseIntArray;

    move-result-object v0

    return-object v0
.end method
