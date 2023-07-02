.class final Lx1/t2$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field public final a:Lz2/u;

.field public final b:Lz2/u$c;

.field public final c:Lx1/t2$a;


# direct methods
.method public constructor <init>(Lz2/u;Lz2/u$c;Lx1/t2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/t2$b;->a:Lz2/u;

    iput-object p2, p0, Lx1/t2$b;->b:Lz2/u$c;

    iput-object p3, p0, Lx1/t2$b;->c:Lx1/t2$a;

    return-void
.end method
