.class public final synthetic Ls7/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/f;


# instance fields
.field public final synthetic a:Ls7/e;

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ls7/e;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls7/c;->a:Ls7/e;

    iput-object p2, p0, Ls7/c;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ls7/c;->a:Ls7/e;

    iget-object v1, p0, Ls7/c;->b:Landroid/app/Activity;

    check-cast p1, Lu4/a;

    invoke-static {v0, v1, p1}, Ls7/e;->c(Ls7/e;Landroid/app/Activity;Lu4/a;)V

    return-void
.end method
