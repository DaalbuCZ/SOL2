.class Lg8/c$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# instance fields
.field public final a:Lt8/c$a;

.field public final b:Lg8/c$d;


# direct methods
.method constructor <init>(Lt8/c$a;Lg8/c$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/c$f;->a:Lt8/c$a;

    iput-object p2, p0, Lg8/c$f;->b:Lg8/c$d;

    return-void
.end method
