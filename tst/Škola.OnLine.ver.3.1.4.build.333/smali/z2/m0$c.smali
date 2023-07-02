.class final Lz2/m0$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field public final a:Lx1/n1;

.field public final b:Lb2/y$b;


# direct methods
.method private constructor <init>(Lx1/n1;Lb2/y$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/m0$c;->a:Lx1/n1;

    iput-object p2, p0, Lz2/m0$c;->b:Lb2/y$b;

    return-void
.end method

.method synthetic constructor <init>(Lx1/n1;Lb2/y$b;Lz2/m0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/m0$c;-><init>(Lx1/n1;Lb2/y$b;)V

    return-void
.end method
