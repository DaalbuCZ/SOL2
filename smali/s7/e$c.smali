.class public final Ls7/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls7/e;->onAttachedToActivity(Ld8/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld8/c;


# direct methods
.method constructor <init>(Ld8/c;)V
    .locals 0

    iput-object p1, p0, Ls7/e$c;->a:Ld8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Activity;
    .locals 2

    iget-object v0, p0, Ls7/e$c;->a:Ld8/c;

    invoke-interface {v0}, Ld8/c;->e()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "activityPluginBinding.activity"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ll8/m;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls7/e$c;->a:Ld8/c;

    invoke-interface {v0, p1}, Ld8/c;->b(Ll8/m;)V

    return-void
.end method
