.class public final synthetic Lk5/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln6/b;


# instance fields
.field public final synthetic a:Lk5/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lk5/e;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/d;->a:Lk5/e;

    iput-object p2, p0, Lk5/d;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk5/d;->a:Lk5/e;

    iget-object v1, p0, Lk5/d;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lk5/e;->b(Lk5/e;Landroid/content/Context;)Lt6/a;

    move-result-object v0

    return-object v0
.end method
