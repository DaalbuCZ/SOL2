.class final Ld9/i$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Method;

.field public final b:Ljava/lang/reflect/Method;

.field public final c:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/i$a;->a:Ljava/lang/reflect/Method;

    iput-object p2, p0, Ld9/i$a;->b:Ljava/lang/reflect/Method;

    iput-object p3, p0, Ld9/i$a;->c:Ljava/lang/reflect/Method;

    return-void
.end method
