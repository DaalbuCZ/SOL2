.class public final La8/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La8/e;->onAttachedToActivity(Ll8/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll8/c;


# direct methods
.method constructor <init>(Ll8/c;)V
    .locals 0

    iput-object p1, p0, La8/e$c;->a:Ll8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lt8/m;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La8/e$c;->a:Ll8/c;

    invoke-interface {v0, p1}, Ll8/c;->b(Lt8/m;)V

    return-void
.end method

.method public c()Landroid/app/Activity;
    .locals 2

    iget-object v0, p0, La8/e$c;->a:Ll8/c;

    invoke-interface {v0}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "activityPluginBinding.activity"

    invoke-static {v0, v1}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
