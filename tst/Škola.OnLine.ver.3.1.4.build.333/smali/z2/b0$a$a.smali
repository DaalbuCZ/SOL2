.class final Lz2/b0$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/b0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Lz2/b0;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lz2/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/b0$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lz2/b0$a$a;->b:Lz2/b0;

    return-void
.end method
