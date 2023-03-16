.class Ld/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/core/view/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ld/f;


# direct methods
.method constructor <init>(Ld/f;)V
    .locals 0

    iput-object p1, p0, Ld/f$a;->n:Ld/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Ld/f$a;->n:Ld/f;

    invoke-virtual {v0, p1}, Ld/f;->c(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
