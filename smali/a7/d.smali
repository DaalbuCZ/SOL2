.class public final synthetic La7/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic n:La7/e;

.field public final synthetic o:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(La7/e;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La7/d;->n:La7/e;

    iput-object p2, p0, La7/d;->o:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    iget-object v0, p0, La7/d;->n:La7/e;

    iget-object v1, p0, La7/d;->o:Landroid/view/View;

    invoke-static {v0, v1}, La7/e;->a(La7/e;Landroid/view/View;)V

    return-void
.end method
