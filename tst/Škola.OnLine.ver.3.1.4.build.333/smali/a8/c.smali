.class public final synthetic La8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/f;


# instance fields
.field public final synthetic a:La8/e;

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(La8/e;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/c;->a:La8/e;

    iput-object p2, p0, La8/c;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, La8/c;->a:La8/e;

    iget-object v1, p0, La8/c;->b:Landroid/app/Activity;

    check-cast p1, Lz4/a;

    invoke-static {v0, v1, p1}, La8/e;->c(La8/e;Landroid/app/Activity;Lz4/a;)V

    return-void
.end method
