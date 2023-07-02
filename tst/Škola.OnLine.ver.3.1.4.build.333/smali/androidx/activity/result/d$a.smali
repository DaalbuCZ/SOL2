.class public final Landroidx/activity/result/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ld/d$f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ld/d$b;->a:Ld/d$b;

    iput-object v0, p0, Landroidx/activity/result/d$a;->a:Ld/d$f;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/activity/result/d;
    .locals 2

    new-instance v0, Landroidx/activity/result/d;

    invoke-direct {v0}, Landroidx/activity/result/d;-><init>()V

    iget-object v1, p0, Landroidx/activity/result/d$a;->a:Ld/d$f;

    invoke-virtual {v0, v1}, Landroidx/activity/result/d;->b(Ld/d$f;)V

    return-object v0
.end method

.method public final b(Ld/d$f;)Landroidx/activity/result/d$a;
    .locals 1

    const-string v0, "mediaType"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/result/d$a;->a:Ld/d$f;

    return-object p0
.end method
